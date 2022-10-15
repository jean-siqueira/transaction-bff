package br.com.marcel.transactionbff.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@ToString
public class Conta implements Serializable {

    private static final long serialVersionUID = 2806412403585360625L;

    @Schema(description = "Código da Agência")
    @NotNull(message = "Informar o código da Agência.")
    private Long codigoAgencia;
    @Schema(description = "Código da Conta")
    @NotNull(message = "Informar o código da Conta.")
    private Long codigoConta;
    @NotNull(message = "Informar a conta de origem da transação")
    @Schema(description = "Conta de origem da transação")
    @Valid
    private Conta conta;
    @Schema(description = "Beneficiário da transação")
    @Valid
    private BeneficiatioDto beneficiario;
    @NotNull(message = "Informar o tipo da transação")
    @Schema(description = "Tipo de transação")
    private TipoTransacao tipoTransacao;
    @Schema(description = "Situação da transação")
    private SituacaoEnum situacao;

}
