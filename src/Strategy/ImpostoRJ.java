package Strategy;

import java.math.BigDecimal;

public class ImpostoRJ implements Imposto{

    @Override
    public BigDecimal calcularImposto(BigDecimal valor) {
        return valor.multiply(BigDecimal.TEN);
    }
}
