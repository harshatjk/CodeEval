def age_distribution
	f = File.open("C:/Ruby200/Files/Tes.txt")
	f.each_line do |value|
		#puts value
		number = value.to_i
		case number
			when 0..2
				puts "Still in Mama's arms"
			when 3..4
				puts "Preschool Manaic"
			when 5..11
				puts "Elementary school"
			when  12..14
				puts "Middle school"
			when 15..18
				puts "High school"
			when 19..22
				puts "College"
			when 23..65
				puts "Working for the man"
			when 66..100
				puts "The Golden Years"
			else
				puts "This program is for humans"
		end
	end
end

age_distribution()