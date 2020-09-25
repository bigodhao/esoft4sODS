package AepOds.Cadastro.ValueObject;

public class Nome {
    private String valor;
    public Nome (String valor){
        if(validar(valor)){
            this.valor = valor;
        }
    }
    private static boolean validar(String valor) {
        if (null == valor || valor.trim().length() == 0 || valor.trim().split(" ").length < 2) {
            throw new RuntimeException("O nome deve conter duas palavras!")
        }else{
            return true;
        }
    }
}
