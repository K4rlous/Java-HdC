package secao26;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME) // Anotação disponível em tempo de execução
@Target(ElementType.FIELD) // Anotação pode ser aplicada a campos
@interface NotEmpty {
    String message() default "O campo não pode ser vazio ou nulo";

    
    
}
