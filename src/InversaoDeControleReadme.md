/* 
# Inversão de controle:
- uma analogia com o carro. 
- no carro o motor depende da bateria. porém a bateria esta encaixada fora da area do motor.
- o motivo é porque se eu precisar trocar a bateria, eu não preciso abrir o motor.
- obs. isso é um principio de design de sistemas e se aplica ao software.
- dessa forma é preciso INVERTER O CONTROLE. o controle tem que ficar fora do motor. 
- obs. se um componente A depende do componente B, entao o A nao deve ter o controle sobre essa dependencia(B).

obs nesse exemplo onde temos a entities Employee, e os services TaxService, PensionService, e SalaryService:
para fazer a inversao de controle, dentro do SalaryService eu nao posso ter o controle do TaxService e do PensionService.



*/