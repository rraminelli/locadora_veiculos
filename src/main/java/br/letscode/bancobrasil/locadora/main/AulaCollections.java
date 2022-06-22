package br.letscode.bancobrasil.locadora.main;

import br.letscode.bancobrasil.locadora.model.Carro;
import br.letscode.bancobrasil.locadora.model.Veiculo;

import java.util.*;

public class AulaCollections {

    public static void main(String[] args) {

        //hashSetString();
        veiculos();

    }

    static void hashSetString() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("XYZ1234");
        stringSet.add("XYZ1234");
        for (String str : stringSet) {
            System.out.println(str);
        }
    }

    static void veiculos() {
        List<Veiculo> veiculoList = new ArrayList<>();
        //Set<Veiculo> veiculosSet = new HashSet<>();

        Veiculo veiculo1 = new Carro();
        veiculo1.setPlaca("XYZ1234");

        veiculoList.add(veiculo1);

        Veiculo veiculo2 = new Carro();
        veiculo2.setPlaca("XYZ1234");

        veiculoList.add(veiculo2);

        for (Veiculo veiculo : veiculoList) {
            System.out.println(veiculo);
            System.out.println(veiculo.getPlaca());
        }

        System.out.println("Possui 1: " + veiculoList.contains(veiculo1));
        System.out.println("Possui 2: " + veiculoList.contains(veiculo2));

        Collections.sort(veiculoList);
    }

}
