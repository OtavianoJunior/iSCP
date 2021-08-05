window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Adiantamento = window.blockly.js.blockly.Adiantamento || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Adiantamento.Fechar_Modal_DotacaoArgs = [];
window.blockly.js.blockly.Adiantamento.Fechar_Modal_Dotacao = async function() {

  this.cronapi.screen.changeValueOfField("DespesasAdiantamento.active.ficha", '9999999');
  this.cronapi.screen.changeValueOfField("DotacaoOrc_IdCombo.active.aplicacao", '9999999');
  this.cronapi.screen.hideModal("modal_dotação");
  return "DespesasAdiantamento.active.fonte";
}

/**
 * Adiantamento
 */
window.blockly.js.blockly.Adiantamento.Abrir_Modal_Dota_C3_A7_C3_A3oArgs = [];
window.blockly.js.blockly.Adiantamento.Abrir_Modal_Dota_C3_A7_C3_A3o = async function() {

  this.cronapi.screen.showModal("modal_dotação");
}
