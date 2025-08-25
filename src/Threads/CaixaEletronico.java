import java.math.BigDecimal;

public class CaixaEletronico 
{
    // Synchronized que só permite uma thread por vez acessar o recurso
    public static synchronized void sacar(ContaBancaria conta, BigDecimal valor) 
    {
        if (conta.getSaldo().compareTo(valor) < 0)
        {
            System.out.println("Saldo insuficiente!");
        } 
        else
        {
            conta.debitar(valor);
            System.out.println("Saque realizado: " + valor.doubleValue());
        }
        System.out.println("Saldo Atual: " + conta.getSaldo().doubleValue());
    }
}
