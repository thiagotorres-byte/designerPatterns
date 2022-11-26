package Strategy;

import java.math.BigDecimal;

public class NotaFiscal {

    Imposto imposto;

    public NotaFiscal(Imposto imposto) {
        this.imposto = imposto;
    }

    public BigDecimal calcularImposto (BigDecimal valor){
        return imposto.calcularImposto(valor);
    }

}
