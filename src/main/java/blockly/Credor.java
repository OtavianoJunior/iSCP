package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Credor {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Valida Código Credor de acordo com seu Tipo:
// 1-CNPJ, 2-CPF , 3-Outros
public static Var Validar_Credor() throws Exception {
 return new Callable<Var>() {

   private Var Credor_validado = Var.VAR_NULL;

   public Var call() throws Exception {

    if (
    Var.valueOf(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Fornecedor.active.tipoFornecedor")).equals(
    Var.valueOf(1))).getObjectAsBoolean()) {

        Credor_validado =
        cronapi.validation.Operations.validateCNPJ(
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("Fornecedor.active.codFornecedor")));

        if (
        Var.valueOf(Credor_validado.equals(
        Var.VAR_FALSE)).getObjectAsBoolean()) {

            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
            Var.valueOf("CNPJ Inválido"));

            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.focusComponent"),
            Var.valueOf("Fornecedor.active.codFornecedor"));
        }
    } else if (
    Var.valueOf(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Fornecedor.active.tipoFornecedor")).equals(
    Var.valueOf(2))).getObjectAsBoolean()) {

        Credor_validado =
        cronapi.validation.Operations.validateCPF(
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("Fornecedor.active.codFornecedor")));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("Fornecedor.active.codFornecedor"),
        cronapi.conversion.Operations.formatDouble(
        Var.valueOf("Fornecedor.active.codFornecedor"),
        Var.valueOf("999.999.999.99\n")));

        if (
        Var.valueOf(Credor_validado.equals(
        Var.VAR_FALSE)).getObjectAsBoolean()) {

            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
            Var.valueOf("CPF Inválido"));

            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.focusComponent"),
            Var.valueOf("Fornecedor.active.codFornecedor"));
        }
    } else {

        Credor_validado =
        Var.VAR_TRUE;
    }
    return Credor_validado;
   }
 }.call();
}

}

