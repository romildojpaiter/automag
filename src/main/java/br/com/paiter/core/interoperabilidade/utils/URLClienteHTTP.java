package br.com.paiter.core.interoperabilidade.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.common.io.CharStreams;

import br.com.paiter.core.exception.ServidorIndisponivelException;
import br.com.paiter.core.interoperabilidade.ClienteHTTP;

public class URLClienteHTTP implements ClienteHTTP {

	@Override
	public String get(String url) {
		
		try {
			URL servico = new URL(url);
			InputStream resposta = servico.openStream();
			
			Reader reader = new InputStreamReader(resposta);
			return CharStreams.toString(reader);
			
		} catch (MalformedURLException e) {
			throw new IllegalArgumentException("A url " + url +
					" está inválida, corrija-a!", e);
		} catch (IOException e) {
			throw new ServidorIndisponivelException(url, e);
		}
	}

}
