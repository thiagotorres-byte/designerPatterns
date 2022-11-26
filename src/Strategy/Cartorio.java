package Strategy;

import java.math.BigDecimal;

public class Cartorio {
    public static void main(String[] args) {

        Imposto imposto = new ImpostoSP();

        NotaFiscal notaFiscal = new NotaFiscal(imposto);

        BigDecimal impostoCalculado = notaFiscal.calcularImposto(BigDecimal.valueOf(2.0));

        System.out.println(impostoCalculado);

    }
}
