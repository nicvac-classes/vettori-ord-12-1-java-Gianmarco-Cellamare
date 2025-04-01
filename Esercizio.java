
import java.util.Scanner;


public static int bubbleNOTott(int[] R,int N){
    int N,i,j,t,nconfronti;
    i=0;
    while (i<=N-1){
        j=0;
        while(j<=N-2){
            if(V[i] > V[j+1]){
                t=V[i];
                V[i]=V[j+1];
                V[j+1]=t;
                nconfronti++;
            }
            j=j+1;
        }
        i=i+1
    }
    return nconfronti;
}

public static int bubbleott(int[] R,int N){
    int N,i,j,t,nconfronti;
    i=0;
    while (i<=N-1){
        j=0;
        while(j<=N-1){
            if(V[i] > V[j+1]){
                t=V[i];
                V[i]=V[j+1];
                V[j+1]=t;
                nconfronti++;
            }
            j=j+1;
        }
        i=i+1
    }
    return nconfronti;
}

public static int bubbleott1(int[] R,int N){
    int N,i,j,t,nconfronti;
    boolean scambio;
    i=0;
    while (i<=N-1){
        j=0;
        scambio=false;
        while(j<=N-1){
            if(V[i] > V[j+1]){
                t=V[i];
                V[i]=V[j+1];
                V[j+1]=t;
                scambio=true;
                nconfronti++;
            }
            j=j+1;
        }
        i=i+1
    }
    return nconfronti;
}



class Esercizio {
    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );
        int N,i,j;
        System.out.print("Inserisci numero elementi ");
        N = in.nextLine();
        i=0:
        do{
            System.out.print(+V[i]);
        }while(i<N)

    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md