package atividade2;

public class MediaDasMedias {
    public static void main(String[] args) {
        double[] media = new double[3];
        media[0] = (8.9 + 7) / 2;
        media[1] = (4.0 + 5.0 + 6.0) / 3;
        double soma = media[0] + media[1];
        media[2] = soma / 2;

        System.out.println("Média de 8.9 e 7: "+ media[0]);
        System.out.println("Média de 4, 5 e 6: "+ media[1]);
        System.out.println("Soma das médias : "+ soma);
        System.out.println("Média das médias: "+ media[2]);

    }


}
