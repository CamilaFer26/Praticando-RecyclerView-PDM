package com.unir.apprecyclerview.model;

import java.util.ArrayList;

public class CachorroData {

    public static ArrayList<Cachorro> getCachorros() {

        ArrayList<Cachorro> cachorros = new ArrayList<>();

        cachorros.add(new Cachorro(
                "Shakira",
                "SRD",
                "Cão de pequeno porte conhecida por seu apetite, inteligência acima da média e coragem. Já colocou cachorro 3x maior que ela para correr.",
                "https://raw.githubusercontent.com/CamilaFer26/Praticando-RecyclerView-PDM/refs/heads/main/docs/imgs/shakira.jpeg"
        ));

        cachorros.add(new Cachorro(
                "Mel",
                "SRD mais próxima de Pinscher",
                "Cão de pequeno porte conhecida por seu instinto de caça, energia e curiosidade. Seu passa tempo favorito é seguir as pessoas e eventualmente fazer alguém tropeçar.",
                "https://raw.githubusercontent.com/CamilaFer26/Praticando-RecyclerView-PDM/refs/heads/main/docs/imgs/mel.jpeg"
        ));

        cachorros.add(new Cachorro(
                "Aruna (Pepino para os mais próximos)",
                "SRD",
                "Cão de porte MUITO pequeno, conhecida por gostar de dormir e latir para coisas desconhecidas (como portão que se move sozinho e vassouras em uso).",
                "https://raw.githubusercontent.com/CamilaFer26/Praticando-RecyclerView-PDM/refs/heads/main/docs/imgs/aruna.jpeg"
        ));

        cachorros.add(new Cachorro(
                "Max",
                "Beagle",
                "Cão de porte médio conhecido por seu excelente olfato.",
                "https://images.dog.ceo/breeds/beagle/n02088364_11136.jpg"
        ));

        cachorros.add(new Cachorro(
                "Thor",
                "Golden Retriever",
                "Raça conhecida pelo comportamento amigável e sociável.",
                "https://images.dog.ceo/breeds/retriever-golden/n02099601_10.jpg"
        ));

        cachorros.add(new Cachorro(
                "Luna",
                "Husky",
                "Cão resistente e ativo, originalmente utilizado em regiões frias.",
                "https://images.dog.ceo/breeds/husky/n02110185_1469.jpg"
        ));

        cachorros.add(new Cachorro(
                "Bob",
                "Pug",
                "Cão de pequeno porte conhecido pelo focinho curto.",
                "https://images.dog.ceo/breeds/pug/n02110958_15626.jpg"
        ));

        cachorros.add(new Cachorro(
                "Mel",
                "Chihuahua",
                "Uma das menores raças de cães do mundo.",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTuGBNnjv3XlVBs0wo6jCIPT86XfvgC2UjgQpGVNOromw&s=10"
        ));

        cachorros.add(new Cachorro(
                "Simba",
                "Akita",
                "Raça japonesa conhecida por sua força e comportamento reservado.",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQr0MLJtZkI3sUpuRHlTea29BTzOnRreR7ElpkR_L1k5w&s=10"
        ));

        return cachorros;
    }
}
