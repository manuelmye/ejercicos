def costodeamburguesa():    
    costofin=0
    for tipoham in range(1,4):
        if tipoham==1:
            costoham=int(input("cuantas hamburguesas llevara de tipo simple:"))
            costofin=costofin+costoham*20
        elif tipoham==2:
            costoham=int(input("cuantas hamburguesas llevara de tipo doble:"))
            costofin=costofin+costoham*25
        else:
            costoham= int(input("cuantas hamburguesas llevara de tipo triple:"))
            costofin=costofin+costoham*28
    print(f"el costo de hamburguesa es: {costofin}")
    pagotarj=input("pagara con tarjeta")
    if pagotarj=="SI":
        costofin=costofin+costofin*0.05
    print(f"el costo final es: {costofin}")

costodeamburguesa()