function solution(today, terms, privacies) {
  const todayInt = getDays(today, 0)
  const map = new Map()
  var answer = [];
  for(let i=0; i<terms.length; i++) {
    map.set(terms[i].split(" ")[0], terms[i].split(" ")[1])
  }
  for(let i=0; i<privacies.length; i++) {
    const date = privacies[i].split(" ")[0]
    const type = privacies[i].split(" ")[1]
    termDay = getDays(date, map.get(type)) - 1
    if(termDay < todayInt) answer.push(i + 1)
  }
  return answer;
}

function getDays(today, term) {
  const dayArr = today.split(".")
  const y = dayArr[0] * 1
  const m = (dayArr[1] * 1) + (term * 1)
  const d = dayArr[2] * 1
  return (y * 12 * 28) + (m * 28) + d
}

//const today = "2020.01.01"
//const terms = ["Z 3", "D 5"]
//const privacies = ["2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"]
const today = "2022.05.19"
const terms = ["A 6", "B 12", "C 3"]
const privacies = ["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"]
console.log(solution(today, terms, privacies))