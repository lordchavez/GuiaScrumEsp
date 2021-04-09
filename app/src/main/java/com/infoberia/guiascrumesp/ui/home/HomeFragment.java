package com.infoberia.guiascrumesp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.infoberia.guiascrumesp.R;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        WebView webView = root.findViewById(R.id.text_home);

        String innerHtml = "<html><br><br><body style='text-align: center'>\n" +
                "<h2>Guía de Scrum en Español</h2>\n" +
                "<p>Seleccione temas desde el menú.</p>\n" +
                "</body></html>";

        webView.loadData( innerHtml, "text/html; charset=UTF-8", null);
        return root;
    }
}