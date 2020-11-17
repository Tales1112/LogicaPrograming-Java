package entities;

public class Conta {
        private String nomeTitularConta;
        private int numeroDaConta;
        private double balance;
        
        public Conta(String nomeTitularConta, int numeroDaConta) {
        	this.nomeTitularConta = nomeTitularConta;
        	this.numeroDaConta = numeroDaConta;
        }
        public Conta(String nomeTitularConta, int numeroDaConta, double depositoInicial) {
        	 this.nomeTitularConta = nomeTitularConta;
        	 this.numeroDaConta = numeroDaConta;
           Deposito(depositoInicial);
        }
        
        public String getNomeTitularConta() {
        	return nomeTitularConta;
        }
        public void setNomeTitularConta(String nomeTitularConta)
        {
        	this.nomeTitularConta = nomeTitularConta;
        }
        public int getNumeroDaConta() {
        	return numeroDaConta;
        }
        public double getBalance() {
        	return balance;
        }
        
        public void  Deposito(double valorDeposito)
        {
        	this.balance += valorDeposito;
        }
        public  void Saque(double valorSaque)
        {
        	valorSaque += 5.00;
        	this.balance -= valorSaque;
        }
}
