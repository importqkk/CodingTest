// Lv.1 크기가 작은 부분 문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/147355

function solution(t, p) {
  let answer = 0;
  for(let i=0; i<=t.length - p.length; i++) {
    if(t.slice(i, i+p.length) <= p) answer++
  }
  return answer;
}

const t = "10203"
const p = "15"
console.log(solution(t, p))