message = input("Input a message: ")
    
bytes_obj = message.encode('utf-8')
print(f"1. Bytes object: {bytes_obj}")



str_obj = bytes_obj.decode('utf-8')
print(f"2. Bytes to string: {str_obj}")



hex_str = bytes_obj.hex()
print(f"3. Bytes to hex: {hex_str}")



bytes_from_hex = bytes.fromhex(hex_str)
print(f"4. Hex to bytes: {bytes_from_hex}")

bytearray_direct = bytearray(message, 'utf-8')
print(f"5. New bytearray: {bytearray_direct}")



bytearray_from_bytes = bytearray(bytes_obj)
print(f"6. Bytes to bytearray: {bytearray_from_bytes}")



sliced_bytes = bytes_obj[6:]
print(f"7. Sliced bytes: {sliced_bytes}")



if len(bytearray_from_bytes) > 0:
    bytearray_from_bytes[0] = 104
    modified_message = bytearray_from_bytes.decode('utf-8')
    print(f"8. Modified message: {modified_message}")
else:
    print("8. Cannot modify an empty bytearray.")