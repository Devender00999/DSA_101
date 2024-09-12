// to find if given value is present as a key in the list

// T(n): O(n), n is no. of keys
// S(n): O(d), d is the depth of nesting of the object
const hasKey = (obj, k) => {
   const keys = Object.keys(obj);
   if (keys.includes(k)) return true;
   for (let key of keys) {
      if (typeof obj[key] === "object" && obj[key] !== null) {
         if (hasKey(obj[key], k)) return true;
      }
   }
   return false;
};
