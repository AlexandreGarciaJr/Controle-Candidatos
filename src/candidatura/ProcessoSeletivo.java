package candidatura;
import java.util.concurrent.ThreadLocalRandom;;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
        selecaoCandidatos();

    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirela", "Daniela", "Jorge"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice=0; indice<candidatos.length; indice++){
           System.out.println("O candidato de n " + indice + " é " + candidatos[indice]); 
        }
    }


    static void selecaoCandidatos(){

        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirela", "Daniela", "Jorge","Junior"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual<candidatos.length) {
            String candidato = candidatos [candidatoAtual]; 
            double salarioPretendido = valorPretendido();  
            
            System.out.println("O candidato " + candidato + " solicitou este valor de salário: "
            + String.format("%.2f", salarioPretendido));

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;               
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");
        }else if (salarioBase==salarioPretendido) {
            System.out.println("Ligar para o Candidato com contra proposta");  
        }else{
        System.out.println("Aguardando  o resultado dos demais candidatos");
        }
    }   
}
