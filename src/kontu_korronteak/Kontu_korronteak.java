package kontu_korronteak;


import java.util.Scanner;

class Bankuetxea {

    protected String NAN, izena, abizena, helbidea, herria, telefonoa, kontu_tipo;

    protected int kontu_kopuru = 0;

    protected String kontu_korrontea[][], aurrezteko_kontua[][];

    Bankuetxea() {
        super();
        NAN = "12345678u";
        izena = "aitor";
        abizena = "lezama";
        helbidea = "herria";
        herria = "donostia";
        telefonoa = "678346571";
        kontu_tipo = "1";
    }

    Bankuetxea(String n1, String n2, String n3, String n4, String n5, String n6, String n7) {
        NAN = n1;
        izena = n2;
        abizena = n3;
        helbidea = n4;
        herria = n5;
        telefonoa = n6;
        kontu_tipo = n7;
    }
}

public class Kontu_korronteak extends Bankuetxea {
    protected String Dirua, Komisioa;

    Kontu_korronteak() {
        Dirua = "1200";
        Komisioa = "20";
    }

    Kontu_korronteak(String NAN, String izena, String abizena, String helbidea, String herria, String telefonoa,
            String kontu_tipo, String diru, String komisio) {
        super();
        Dirua = diru;
        Komisioa = komisio;
    }

    String[][] Kontu_korrontea_sortu(String n1, String n2, String n3, String n4, String n5, String n6, String n7) {
        String[][] kontu_korrontea = new String[100][9];
        // String[][] aurrezteko_kontua = new String[100][7];
        // comprobar que tipo de cuenta es
        kontu_korrontea[0][0] = n1;
        kontu_korrontea[0][1] = n2;
        kontu_korrontea[0][2] = n3;
        kontu_korrontea[0][3] = n4;
        kontu_korrontea[0][4] = n5;
        kontu_korrontea[0][5] = n6;
        kontu_korrontea[0][6] = n7;
        kontu_korrontea[0][7] = "0";
        kontu_korrontea[0][8] = "15";
        kontu_kopuru++;
        return kontu_korrontea;
    }
}

class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aukera = 0;

        System.out.println("Kaixo Kutxara, ongi etorria izan\n"
                + "Aukeratu hauetako aukeratatik bat\n1-Kontu korronteak\n2-Aurrezteku kontuak\n3-Bukatu");
        aukera = sc.nextInt();
        switch (aukera) {
            case 1:
                System.out.println(
                        "\n1.Kontu Korrontea sortu\n2.Kontu Korrontea itxi\n3.Datuak aldatu\n4.Datuak erakutsi\n5.Dirua sartu\n6.Dirua atera.\n7.Saldoa erakutsi\n8.Transferentzia\n9.Bukatu");
                int aukera1 = sc.nextInt();
                switch (aukera1) {
                    case 1:
                        int kont = 0;
                        Kontu_korronteak kontu1 = new Kontu_korronteak();
                        System.out.println("Sartu NAN-a");
                        kontu1.NAN = sc.next();
                        System.out.println("Sartu izena");
                        kontu1.izena = sc.next();
                        System.out.println("Sartu abizena");
                        kontu1.abizena = sc.next();
                        System.out.println("Sartu helbidea");
                        kontu1.helbidea = sc.next();
                        System.out.println("Sartu herria");
                        kontu1.herria = sc.next();
                        System.out.println("Sartu telefonoa");
                        kontu1.telefonoa = sc.next();
                        System.out.println("Ze kontu tipo nahi duzu");
                        kontu1.kontu_tipo = sc.next();
                        String kontu_korronteak[][] = kontu1.Kontu_korrontea_sortu(kontu1.NAN,kontu1.izena,kontu1.abizena,kontu1.helbidea,kontu1.herria,kontu1.telefonoa,kontu1.kontu_tipo);
                            for (int j =0;j<kontu_korronteak[0].length;j++) {
                            System.out.println(kontu_korronteak[0][j]);
                            }
                        break;
                    case 3:
                        System.out.println(
                                "1.NAN aldatu\n2.Izena aldatu\n3.Abizenak aldatu\n4.Helbidea aldatu\n5.Telefonoa aldatu\n6.Komisioa aldatu\n7.Zorpekoa(descubierto) aldatu\n8.Bukatu");
                        int aukera2 = sc.nextInt();
                        switch (aukera2) {
                            case 1:
                                break;
                        }
                        break;
                }
                break;
            case 2:
                System.out.println(
                        "1.Aurrezteko_Kontua sortu\n2.Aurrezteko_Kontu Korrontea itxi\n3.Datuak aldatu\n4.- Dirua sartu\n5.- Dirua atera.\n6.- Saldo erakutsi\n7.- Interesak kalkulatu\n8.- Bukatu");
                break;
            case 3:
                System.out.println("Programa bukatuta");
                break;
            default:
                break;

        }
    }

}