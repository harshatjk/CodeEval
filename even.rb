def even_number
f = File.open("C:/Ruby200/Files/Tes.txt","rb")
	f.each_line do |value|
		#puts value
		number = value.to_i
		#puts number
		if number % 2 == 0
			puts "1"
		else if number % 2 == 1
			puts "0"
		end
	end
end
end
even_number()