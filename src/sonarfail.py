import os

def divide(a, b):
    return a / b  # ⚠️ Posible división por cero

def insecure_command(user_input):
    os.system("echo " + user_input)  # 🔥 Inyección de comandos

def duplicate_logic():
    for i in range(10):
        print("Hello")  # 🔁 Código duplicado
    for i in range(10):
        print("Hello")

def deeply_nested():
    if True:
        if True:
            if True:
                if True:
                    print("Too deep!")  # 😵 Complejidad innecesaria

def unused_function():
    x = 123  # 💤 Variable nunca usada

def bad_practice():
    password = "123456"  # 🔐 Contraseña hardcodeada
    print("Login with password: " + password)

def main():
    divide(5, 0)
    insecure_command("hacked && rm -rf /")
    deeply_nested()
    duplicate_logic()

main()
