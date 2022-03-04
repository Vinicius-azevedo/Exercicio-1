package java_utilidades.service;

import java_utilidades.model.Jogo;
import java_utilidades.model.Editora;
import java_utilidades.model.Plataforma;

import java.util.ArrayList;
import java.util.List;

public class ServicoJogo {

    public static List<Jogo> getListByPlatform(List<Jogo> games, Plataforma platform){
        List<Jogo> gamesByPlatform = new ArrayList<>();

        games.stream().filter((game ->
                        game.getPlatform().equals(platform.name()))).
                forEach(game -> gamesByPlatform.add(game));

        return gamesByPlatform;

    }


    public static List<Jogo> getByPuBlisher(List<Jogo> games ,
                                            Editora publisher){
        List<Jogo> gamesByPublisher = new ArrayList<>();

        games.stream().filter((game ->
                        game.getPublisher().replaceAll("\\s+", "").equals(publisher.name()))).
                forEach(game -> gamesByPublisher.add(game));

        return gamesByPublisher;
    }

}
