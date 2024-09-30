import re  # para los espacios y caracteres especiales

texto = ''
clave = ''
texto_cifrado = ''
texto_descifrado = ''

def cifrar():
    global texto, clave, texto_cifrado
    texto = input('dame palabra a cifrar: ')
    clave = input('dame clave para cifrar: ')
    # paso 1: Preparación del texto y la clave
    texto = texto.upper()
    clave = clave.upper()
    texto = re.sub(r'[^A-Za-z]', '', texto)
    while len(clave) != len(texto):
        clave = input(f"Dame clave para cifrar (tiene que tener el mismo largo que '{texto}'): ").upper()
    # Paso 2: Cifrado letra por letra
    texto_cifrado = ''
    for i in range(len(texto)):
        posicion_texto = ord(texto[i]) - ord('A')
        posicion_clave = ord(clave[i]) - ord('A')
        posicion_cifrada = (posicion_texto + posicion_clave) % 26
        letra_cifrada = chr(posicion_cifrada + ord('A'))
        texto_cifrado += letra_cifrada
    print(texto_cifrado)

# 3. Descifrado del texto cifrado
def descifrar():
    global texto, clave, texto_descifrado
    texto = input('dame palabra cifrada: ').upper()
    clave = input('dame clave para descifrar: ').upper()
    # descifrar
    texto_descifrado = ''
    for i in range(len(texto)):
        pos_cifrada = ord(texto[i]) - ord('A')
        pos_clave = ord(clave[i]) - ord('A')
        pos_texto = (pos_cifrada - pos_clave) % 26
        letra_texto = chr(pos_texto + ord('A'))
        texto_descifrado += letra_texto
    print(texto_descifrado)

cifrar()
descifrar()
