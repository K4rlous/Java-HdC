package secao26;

import java.io.FileWriter;
import java.lang.reflect.Method;

public class LogProcessor {
    
    public static void processarLog(Object objeto) throws Exception {

        Class<?> classe = objeto.getClass();

        String currentDir = System.getProperty("user.dir") + "\\secao26\\";

        for(Method metodo : classe.getDeclaredMethods()){
            if(metodo.isAnnotationPresent(Log.class)) {
                metodo.setAccessible(true);
                Object retorno = metodo.invoke(objeto);
                
                String nomeArquivo = metodo.getName() + ".txt";
                String caminhoArquivo = currentDir + nomeArquivo;
                
                try (FileWriter writer = new FileWriter(caminhoArquivo, true)) {
                    writer.write("Método: " + metodo.getName() + "\n");
                    writer.write("Retorno: " + retorno + "\n");
                    writer.write("====================================\n");
                } catch (Exception e) {
                    System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
                }
            }
        }
        

    }

}
