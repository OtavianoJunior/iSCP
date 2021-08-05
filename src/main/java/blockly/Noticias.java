package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Noticias {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Noticias
public static Var imprimir(@ParamMetaData(description = "titulo") Var titulo) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    System.out.println(
    Var.valueOf("Título da notícia").getObjectAsString());

    System.out.println(titulo.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

