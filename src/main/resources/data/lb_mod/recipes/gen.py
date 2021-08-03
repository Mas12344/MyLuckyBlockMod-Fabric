colors = ["purple", "blue", "black", "green", "orange", "white", "yellow"]
armor = ["helmet", "chestplate", "leggings", "boots"]



for color in colors:
	for armor_piece in armor:
		with open(f"{color}_infused_netherite_{armor_piece}.json", "w") as f:
			text = """{"type": "minecraft:smithing","base": {"item": "minecraft:netherite_"""+ f"{armor_piece}" + """"},"addition": {"item": "lb_mod:"""+f"{color}_rune"+""""},"result": {"item": "lb_mod:"""+f"{color}"+"""_infused_netherite_"""+f"{armor_piece}"+""""}}"""
			#text = r"""{"parent": "item/generated","textures":{"layer0": "lb_mod:item/""" +f"{color}_infused_netherite_{armor_piece}" + """"}}"""
			f.write(text)



#for color in colors:
#	with open(f"{color}_rune.json", "w") as f:
#		text = """{"parent":"item/generated","textures":{"layer0":"lb_mod:item/""" + f"{color}" +   """_rune"}}"""
#		f.write(text)
