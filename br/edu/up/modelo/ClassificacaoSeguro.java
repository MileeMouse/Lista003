package br.edu.up.modelo;

public class ClassificacaoSeguro {
    public static String determinarCategoria(Pretendente pretendente) {
        int idade = pretendente.getIdade();
        String grupoRisco = pretendente.getGrupoRisco();

        if (idade >= 17 && idade <= 20) {
            switch (grupoRisco) {
                case "Baixo":
                    return "Categoria 1";
                case "Médio":
                    return "Categoria 2";
                case "Alto":
                    return "Categoria 3";
            }
        } else if (idade >= 21 && idade <= 24) {
            switch (grupoRisco) {
                case "Baixo":
                    return "Categoria 2";
                case "Médio":
                    return "Categoria 3";
                case "Alto":
                    return "Categoria 4";
            }
        } else if (idade >= 25 && idade <= 34) {
            switch (grupoRisco) {
                case "Baixo":
                    return "Categoria 3";
                case "Médio":
                    return "Categoria 4";
                case "Alto":
                    return "Categoria 5";
            }
        } else if (idade >= 35 && idade <= 64) {
            switch (grupoRisco) {
                case "Baixo":
                    return "Categoria 4";
                case "Médio":
                    return "Categoria 5";
                case "Alto":
                    return "Categoria 6";
            }
        } else if (idade >= 65 && idade <= 70) {
            switch (grupoRisco) {
                case "Baixo":
                    return "Categoria 7";
                case "Médio":
                    return "Categoria 8";
                case "Alto":
                    return "Categoria 9";
            }
        }

        return "Não se enquadra em nenhuma categoria";
    }
}
