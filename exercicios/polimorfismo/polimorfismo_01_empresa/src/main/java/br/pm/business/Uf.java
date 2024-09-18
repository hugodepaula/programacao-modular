package br.pm.business;

public enum Uf {

    ACRE("Acre", "AC"),
    ALAGOAS("Alagoas", "AL"),
    AMAPA("Amapá", "AP"),
    AMAZONAS("Amazonas", "AM"),
    BAHIA("Bahia", "BA"),
    CEARA("Ceará", "CE"),
    DISTRITO_FEDERAL("Distrito Federal", "DF"),
    ESPIRITO_SANTO("Espírito Santo", "ES"),
    GOIAS("Goiás", "GO"),
    MARANHAO("Maranhão", "MA"),
    MATO_GROSSO("Mato Grosso", "MT"),
    MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS"),
    MINAS_GERAIS("Minas Gerais", "MG"),
    PARA("Pará", "PA"),
    PARAIBA("Paraíba", "PB"),
    PARANA("Paraná", "PR"),
    PERNAMBUCO("Pernambuco", "PE"),
    PIAUI("Piauí", "PI"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
    RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN"),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS"),
    RONDONIA("Rondônia", "RO"),
    RORAIMA("Roraima", "RR"),
    SANTA_CATARINA("Santa Catarina", "SC"),
    SAO_PAULO("São Paulo", "SP"),
    SERGIPE("Sergipe", "SE"),
    TOCANTINS("Tocantins", "TO");

    private final String nome;
    private final String sigla;

    Uf(final String nome, final String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public static Uf fromUF(final String nome) {
        for (final Uf uf : Uf.values()) {
            if (uf.nome.equalsIgnoreCase(nome)) {
                return uf;
            }
        }
        return null;
    }

    public static Uf fromSigla(final String sigla) {
        for (final Uf uf : Uf.values()) {
            if (uf.sigla.equalsIgnoreCase(sigla)) {
              return uf;
            }
        }
        return null;
    }
}
