package com.ealves.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Autor: Elias Alves
 * Classe Para calcular 03 06 2020 
 * Acessar o sistema : http://localhost:8080/projeto-servlet-test/index.html
 */
@WebServlet("/calculadora.do")
public class CalcularServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String operacao = request.getParameter("operacao");
		int resultado = 0;
		
		int numeroOne = Integer.parseInt(request.getParameter("numeroOne"));
		int numeroTwo = Integer.parseInt(request.getParameter("numeroTwo"));
		
		
		switch(operacao.charAt(0)){
			case 'a': {
				resultado = numeroOne + numeroTwo;
				break;
			}
			case 's': {
				resultado = numeroOne - numeroTwo;
				break;
			}
			case 'm': {
				resultado = numeroOne * numeroTwo;
				break;
			}
			case 'd': {
				resultado = numeroOne / numeroTwo;
				break;
			}
			
		}
		
		response.setContentType("text/plain");
		PrintWriter saida = response.getWriter();
		saida.write("Resultado = " + resultado);
		saida.close();
		
	}
}
