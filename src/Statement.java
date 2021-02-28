public class Statement {
    public static void main(String[] args) {
        // IF, berjalan jika kondisi benar
        System.out.println("== IF Statement ==");
        Integer okr = 75;
        Integer absensi = 85;
        if (okr >= 70 && absensi >= 85) {
            System.out.println("Gaji boleh naik");
        } else {
            System.out.println("Gaji ga boleh naik");
        }


        // switch, lebih sederhana dari if
        System.out.println("== Switch Statement ==");
        String nilai = "A";
        switch (nilai) {
            case "A":
                System.out.println("Joss");
                break; // utk memberhentikan statement
            case "B":
                System.out.println("Lumayan");
                break;
            default:
                System.out.println("belajar lagi");
        }


        // switch lambda
        // mempermudah saat switch expression karena tidak memerlukan break
        System.out.println("== Switch lambda ==");
        String nilaiLambda = "D";
        switch (nilaiLambda) {
            case "A" -> System.out.println("Joss");
            case "B", "C" -> System.out.println("Lumayan");
            default -> {
                System.out.println("Kok nilainya segitu");
                System.out.println("Ayo belajar lagi");
            }
        }

        // switch dengan yield
        // mempermudah saat switch expression karena tidak memerlukan break
        System.out.println("== Switch yield ==");
        String nilaiYield = "B";
        String output = switch(nilaiYield) {
            case "A" :
                yield "Joss";
            case "B", "C":
                yield "Lumayan";
            default:
                yield "Kok nilainya segitu \n Ayo belajar lagi";
        };
        System.out.println(output);


        // ternary operator
        // operator inlne dari if else
        // jika true maka akan mengambil nilai pertama
        // jika false maka akan mengambil nilai kedua

        System.out.println("== Ternary Operator ==");
        System.out.println(okr >= 70 && absensi >= 85 ?  "Gaji boleh naik" : "Gaji ga boleh naik");
    }
}
