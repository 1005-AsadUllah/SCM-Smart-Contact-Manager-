// import { defineConfig } from 'vite'
// import tailwindcss from '@tailwindcss/vite'
// export default defineConfig({
//   plugins: [
//     tailwindcss(),
//   ],
// })

/** @type {import('tailwindcss').Config} */

export default {
  content: [".src/main/resources/**/*.{html,js}"],
  theme: {
    extend: {},
  },
  plugins: [],
  darkMode: "selector",
};
