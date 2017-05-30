Como instalar o Maven:
https://www.mkyong.com/maven/how-to-install-maven-in-ubuntu/

Como instalar o Java 8:
https://www.digitalocean.com/community/tutorials/como-instalar-o-java-com-apt-get-no-ubuntu-16-04-pt

Como instalar o Eclipse:
https://www.eclipse.org/downloads/?

Tutorial Vaadin:
https://vaadin.com/docs/-/part/framework/tutorial.html

Pontos a serem considerados para manter o projeto de acordo com os princípios da consistência e visibilidade.
+ Consistência e Padronização:
  - Manter a consistência entre a interface e o modelo conceitual do sistema. Ou seja, manter uma coerência entre a interface produzida e o modelo imaginado para o sistema. Se não tiver entendido essa frase pule. NÃO é IMPORTANTE. Só coloquei aqui por completude.
  - Manter consistência entre o que usuário espera do sistema e o que a interface faz. Por exemplo: um botão "Fechar" não deve ser utilizado para cancelar um diálogo em algumas situaçes e confirmar em outras.
  - Evitar utilizar termos próximos para fazer coisas diferentes. Exemplo: utilizar dois botões "gravar" e "salvar" para executar ações diferentes.
  - Ser coerente com padrões associados à plataforma. Exemplo: em uma janela de computador o " X " fecha a janela. Não dar outro significado para isso.
  - Manter os padrões adotados.
  - Manter consistência entre as diferentes janelas. Exmplo: não mudar o significado de botões, caixas, janelas e etc que se encontrem no mesmo lugar, com o mesmo formato e cor, a não ser que a modificação seja clara e perceptível. 
  - Elementos com comportamento diferentes devem possuir aparências diferentes.
  - Em alguns casos parte do sistema pode ser tornada inconsistente de forma proposital para que o usuário não haja de forma automática e tenha que refletir antes de continuar.
  
+ Visibilidade e reconhecimento:

