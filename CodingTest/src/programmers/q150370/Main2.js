function solution(today, terms, privacies) {
  const answer = []
  const [year, month, day] = today.split(".").map(Number)
  const todayNum = (year * 12 * 28) + (month * 28) + day
  let term = {}
  terms.forEach((e) => {
    const [type, month] = e.split(" ")
    term[type] = Number(month)
  })
  privacies.forEach((e, i) => {
    let [date, type] = e.split(" ")
    date = date.split(".").map(Number)
    const dateNum = (date[0] * 12 * 28) + ((date[1] + term[type]) * 28) + date[2] - 1
    if(dateNum < todayNum) answer.push(i + 1)
  })
  return answer
}

const today = "2020.01.01"
const terms = ["Z 3", "D 5"]
const privacies = ["2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"]
//const today = "2022.05.19"
//const terms = ["A 6", "B 12", "C 3"]
//const privacies = ["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"]
console.log(solution(today, terms, privacies))
