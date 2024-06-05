


export const segColors = [
    '#EE4040',
    '#F0CF50',
    '#815CD1',
    '#3DA5E0',
    '#34A24F',
    '#F9AA1F',
    '#EC3F3F',
    '#FF9000'
]

export const game_data = {
    level: ["Easy", "Medium", "Hard"],
    Easy: [
        {
            title: "CSV representation of array", url: "https://www.codewars.com/kata/5a34af40e1ce0eb1f5000036/train/"
        },
        {
            title: "Collinearity", url: "https://www.codewars.com/kata/65ba420888906c1f86e1e680/train/"
        }
    ],
    Medium: [
        {
            title: "Matrix Addition", url: "https://www.codewars.com/kata/526233aefd4764272800036f/train"
        },
        {
            title: "Ones and Zeros", url: "https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train"
        }
    ],
    Hard: [
        {
            title: "Tic-Tac-Toe Checker", url: "https://www.codewars.com/kata/525caa5c1bf619d28c000335/train"
        },
    ]
};


export const searchUrlByTitle = (level, title) => {
    const problems = game_data[level];
    if (!problems) {
        return null; 
    }
    const problem = problems.find((problem) => problem.title === title);
    return problem ? problem.url : null;
};
