string = input("Digite uma palavra: ")
inverter = []
for i in range(len(string)-1, -1, -1):
    inverter.append(string[i])
inverter_string = ''.join(inverter)

print(inverter_string)