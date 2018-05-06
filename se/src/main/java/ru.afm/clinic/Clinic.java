package ru.afm.clinic;

public class Clinic {

    /**
     * Клиенты клиники
     */
    private  Client[] clients;

    public Clinic(final int size){
        super();
        this.clients = new Client[size];
    }

    /**
     * Добавить клиента
     * @param position
     * @param client
     */
    public void addClient(final int position, final Client client){
        this.clients[position] = client;
    }

    /**
     * Возвращает клиентов владеющих данным животным
     * @param petName имя животного
     * @return массив клиентов
     */
    //TODO копировать клиентов в новый массив
    public Client[] findClientsByPetName(final String petName){
        int counter = 0;
        for(Client element: this.clients){
            if(element.getPetName().equals(petName)){
                counter++;
            }
        }
        Client[] clients = new Client[counter];
        int i = 0;
        for(Client element: this.clients){
            if(element.getPetName().equals(petName)){
                clients[i] = element;
                i++;
            }
        }
        return clients;
    }

    public Client findByClientName(final String clientName){

        for(Client client: this.clients){
            if(client.getId().equals(clientName)){
                return client;
            }
        }
        return null;
    }
}
