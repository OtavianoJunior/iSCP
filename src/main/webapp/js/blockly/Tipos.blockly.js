window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Tipos = window.blockly.js.blockly.Tipos || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Tipos.Validar_TpCredorArgs = [];
window.blockly.js.blockly.Tipos.Validar_TpCredor = async function() {
 var Validado;
  if (this.cronapi.screen.getValueOfField("Fornecedor.active.tipoFornecedor") > 3) {
    this.cronapi.screen.notify('error','Tipo de Credor Inválido');
    this.cronapi.screen.focusComponent("textinput-tipoFornecedor");
    Validado = false;
  } else {
    Validado = true;
  }
  return Validado;
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Tipos.Verificar_TpValidadoArgs = [];
window.blockly.js.blockly.Tipos.Verificar_TpValidado = async function() {
 var Validado;
  if (await this.blockly.js.blockly.Tipos.Validar_TpCredor() == true) {
    this.cronapi.screen.post("Fornecedor");
  } else {
    this.cronapi.screen.notify('error','Dados Inválidos');
  }
}
