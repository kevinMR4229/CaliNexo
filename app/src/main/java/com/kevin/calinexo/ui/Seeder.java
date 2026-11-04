package com.kevin.calinexo.ui;

import com.kevin.calinexo.ui.component.Instruction;

import java.util.List;

public class Seeder {

    public List<Instruction> sendInstructionStepCards() {
        return List.of(
                new Instruction("Agarre y Posicion", "Sujetate de la barra con las palmas hacia arriba"),
                new Instruction("Traccion ocmpleta", "Tira hacia arriba solo usando los brazos hasta que la barbilla sobrepase la barra"
                ));


    }
}
