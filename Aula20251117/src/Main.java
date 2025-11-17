import enums.*;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
//        for (Opcoes opcao : Opcoes.values()) {
//            System.out.printf("%-25s #%02d: %-20s\n", opcao, opcao.getValor(), opcao.getNome());
//
//            switch (opcao) {
//                case COMPACATAR:
//                    System.out.println("Iniciando processo de compactação...");
//                    break;
//                case DESCOMPACATAR:
//                    System.out.println("Iniciando processo de descompactação...");
//                    break;
//            }
//        }

        for (Book book : Book.values()) {
            System.out.printf("%-45s Ano de Copyright: %s\n", book.getTitle(), book.getCopyrightYear());
        }

        System.out.println("\nLivros entre JHTP e CPPHTP:\n");

        for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP)) {
            System.out.printf("%-45s Ano de Copyright: %s\n", book.getTitle(), book.getCopyrightYear());
        }
    }
}
