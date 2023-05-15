package com.br.joaopedro.gameexplorer.services;

import com.br.joaopedro.gameexplorer.dto.GameListDTO;
import com.br.joaopedro.gameexplorer.entities.GameList;
import com.br.joaopedro.gameexplorer.projections.GameMinProjection;
import com.br.joaopedro.gameexplorer.repositories.GameListRepository;
import com.br.joaopedro.gameexplorer.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//responsavel pela regra de negocio
@Service //registra como componentes do sistema
public class GameListService {

    @Autowired //esta injetando(chamando) o gamerepository dentro da service.
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for(int i = min; i <=max; i++ ){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }

}
