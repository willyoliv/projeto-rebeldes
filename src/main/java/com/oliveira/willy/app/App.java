package com.oliveira.willy.app;

import com.oliveira.willy.app.controller.InteligenciaCentral;
import com.oliveira.willy.app.view.InteligenciaCentralView;
import com.oliveira.willy.app.view.RebeldeView;

public class App 
{
    public static void main( String[] args )
    {
        InteligenciaCentral inteligenciaCentral = new InteligenciaCentral();
        RebeldeView rebeldeView = new RebeldeView();
        InteligenciaCentralView inteligenciaCentralView = new InteligenciaCentralView(inteligenciaCentral, rebeldeView);
        inteligenciaCentralView.exibirMenu();
    }
}
