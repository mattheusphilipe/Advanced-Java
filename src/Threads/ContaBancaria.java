import java.math.BigDecimal;

public class ContaBancaria
{
    private BigDecimal saldo;

    public ContaBancaria(BigDecimal saldo) 
    {
        this.saldo = saldo;
    }

    public void creditar(BigDecimal deposito)
    {
        saldo = saldo.add(deposito);
    }

    public void debitar(BigDecimal debito) 
    {
        saldo = saldo.subtract(debito);
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    } 
}