package tutorials.groovy.lists

class GroovyListSplit {
	
	static main(args) {
		def cartoons = [
				'Regular Show',
                'The Amazing World of Gumball',
                'Adventure Time',
                'Uncle Grandpa',
                'Batman'
            ]
			
		def cartoonsSplitListWithTwoCartoonEach = cartoons.collate(2)
		println cartoonsSplitListWithTwoCartoonEach
		
		def cartoonsSplitListWithThreeCartoonEach = cartoons.collate(3)
		println cartoonsSplitListWithThreeCartoonEach
		
		def cartoonsSplitListWithoutRemainder = cartoons.collate(2, false)
		println cartoonsSplitListWithoutRemainder
	}
}
