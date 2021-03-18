import java.math.BigInteger;
import java.util.Scanner;
public class iban {
    static String calculaDcIban(String codigoPais,String entidad,String oficina,String dc,String numeroCuenta){
       
        String preIban = entidad+
                oficina+
                dc+
                numeroCuenta+
                damePesoIBAN(codigoPais.charAt(0))+
                damePesoIBAN(codigoPais.charAt(1))+
                "00";
        BigInteger ccc = new BigInteger(preIban);
        BigInteger noventaysiete = new BigInteger("97");
        ccc = ccc.mod(noventaysiete);
        int dcIb = ccc.intValue();
        dcIb = 98 - dcIb;
        return ponCerosIzquierda(Integer.toString(dcIb),2);
    }
   
    static String ponCerosIzquierda(String str,int longitud){
        String ceros = "";
        if(str.length()<longitud){
            for(int i=0;i<(longitud-str.length());i++){
                ceros = ceros + '0';
            }
            str = ceros + str;
        }
       
        return str;
    }
   
    static String damePesoIBAN(char letra){
        String peso = "";
        letra = Character.toUpperCase(letra);
        switch (letra){
            case 'A':
             peso = "10";
                break;
            case 'B':
             peso = "11";
                break;
            case 'C':
             peso = "12";
                break;
            case 'D':
             peso = "13";
                break;
            case 'E':
             peso = "14";
                break;
            case 'F':
             peso = "15";
                break;
            case 'G':
              peso = "16";
                break;
            case 'H': peso = "17";
                break;
            case 'I': peso = "18";
                break;
            case 'J': peso = "19";
                break;
            case 'K': peso = "20";
                break;
            case 'L': peso = "21";
                break;
            case 'M': peso = "22";
                break;
            case 'N': peso = "23";
                break;
            case 'O': peso = "24";
                break;
            case 'P': peso = "25";
                break;
            case 'Q': peso = "26";
                break;
            case 'R': peso = "27";
                break;
            case 'S': peso = "28";
                break;
            case 'T': peso = "29";
                break;
            case 'U': peso = "30";
                break;
            case 'V': peso = "31";
                break;
            case 'W': peso = "32";
                break;
            case 'X': peso = "33";
                break;
            case 'Y': peso = "34";
                break;
            case 'Z': peso = "35";
                break;
        }
        return peso;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(calculaDcIban("ES98", "2038", "5778", "98", "00000000"));
    }
}
