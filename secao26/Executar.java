package secao26;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Define que a anotação estará disponível em tempo de execução
@Target(ElementType.METHOD) // Define que a anotação pode ser aplicada a métodos
@interface Executar {
    int vezes() default 1; // Define um atributo com valor padrão
}
