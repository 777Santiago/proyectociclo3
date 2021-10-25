package co.usa.proyecto.proyecto.service;

import co.usa.proyecto.proyecto.model.Client;
import co.usa.proyecto.proyecto.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.getAll();
    }

    public Optional<Client> getClient(int id){
        return clientRepository.getClient(id);
    }

    public Client save(Client c){
        if(c.getId()==null){
            return clientRepository.save(c);
        }else{
            Optional<Client> caux=clientRepository.getClient(c.getId());
            if (caux.isPresent()){
                return clientRepository.save(c);
            }else{
                return c;
            }
        }
    }
}