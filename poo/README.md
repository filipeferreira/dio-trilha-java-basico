```mermaid
classDiagram
Iphone <|-- Smartphone
Smartphone <|-- ReprodutorMusical
Smartphone <|-- AparelhoTelefonico
Smartphone <|-- NavegadorInternet

    class Smartphone {
        <<Abstract>>
    }
    class ReprodutorMusical{
        <<Interface>>
        +tocar()
        +pausar()
        +selecionarMusica(musica)
    }
    class AparelhoTelefonico{
        +ligar(numero)
        +atender()
        +iniciarCorreioVoz()
    }
    class NavegadorInternet{
        <<Interface>>
        +exibirPagina(url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
