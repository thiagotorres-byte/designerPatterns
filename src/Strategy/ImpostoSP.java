package Strategy;

import java.math.BigDecimal;

public class ImpostoSP implements Imposto{

    @Override
    public BigDecimal calcularImposto(BigDecimal valor) {
        return valor.multiply(BigDecimal.ONE);
    }
}
