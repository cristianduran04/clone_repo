package com.example.movilesparcial;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MainActivityTest {

    @Mock
    private Button mockProducto1Button;

    @Mock
    private Button mockProducto2Button;

    @Mock
    private View mockView;

    @Mock
    private MainActivity mainActivity;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        when(mockProducto1Button.getId()).thenReturn(R.id.producto1);
        when(mockProducto2Button.getId()).thenReturn(R.id.producto2);

        mainActivity = new MainActivity();
    }

    @Test
    public void testProducto1ButtonClick() {

        mainActivity.onClick(mockView);
        verify(mainActivity).startActivity(new Intent(mainActivity, ResultadoActivity.class).putExtra("producto", "tomate"));
    }

    @Test
    public void testProducto2ButtonClick() {

        mainActivity.onClick(mockView);
        verify(mainActivity).startActivity(new Intent(mainActivity, ResultadoActivity.class).putExtra("producto", "cebolla"));
    }
}