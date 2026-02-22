package util;
import java.util.Scanner;

public class Util {

    private static final Scanner sc = new Scanner(System.in);

    private Util() {
        throw new UnsupportedOperationException("classe utilitaria");
    }

    public static boolean isVazio(String s) {
        return s == null || s.trim().isEmpty();
    }

    public static String capitalizar(String s) {
        if (isVazio(s)) return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static String leString() {
        while (true) {
            try {
                String s = sc.next();
                sc.nextLine();
                return s;
            } catch (Exception e) {
                System.out.println("Erro ao digitar. Tente novamente");
                sc.nextLine();
            }
        }
    }

    public static int leInteiro() {
        while (true) {
            try {
                int i = sc.nextInt();
                sc.nextLine();
                return i;
            } catch (Exception e) {
                System.out.println("ERRO! Tente novamente");
                sc.nextLine();
            }
        }
    }

    public static float leDecimal() {
        while (true) {
            try {
                float f = sc.nextFloat();
                sc.nextLine();
                return f;
            } catch (Exception e) {
                System.out.println("ERRO! Tente novamente.");
                sc.nextLine();
            }
        }
    }

    public static long leLong() {
        while (true) {
            try {
                long l = sc.nextLong();
                sc.nextLine();
                return l;
            } catch (Exception e) {
                System.out.println("ERRO! Tente novamente.");
                sc.nextLine();
            }
        }
    }

    public static char leChar() {
        while (true) {
            try {
                char c = sc.next().charAt(0);
                sc.nextLine();
                return c;
            } catch (Exception e) {
                System.out.println("ERRO! Tente novamente.");
                sc.nextLine();
            }
        }
    }

    public static boolean leBoolean() {
        while (true) {
            try {
                boolean b = sc.nextBoolean();
                sc.nextLine();
                return b;
            } catch (Exception e) {
                System.out.println("ERRO! Tente novamente.");
                sc.nextLine();
            }
        }
    }


    public static boolean validarCPF(String cpf) {
        cpf = cpf.replaceAll("\\D", "");

        if (cpf.length() != 11) return false;
        if (cpf.matches("(\\d)\\1{10}")) return false;

        int soma = 0;
        int peso = 10;

        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * peso--;
        }

        int digito1 = 11 - (soma % 11);
        if (digito1 >= 10) digito1 = 0;
        if (digito1 != (cpf.charAt(9) - '0')) return false;

        soma = 0;
        peso = 11;

        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * peso--;
        }

        int digito2 = 11 - (soma % 11);
        if (digito2 >= 10) digito2 = 0;

        return digito2 == (cpf.charAt(10) - '0');
    }



}